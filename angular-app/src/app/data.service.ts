import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  private nacionalidades = new BehaviorSubject<any>([ 
    { id: 1, nacionalidad : 'argentino'  }, 
    { id: 2, nacionalidad : 'venezolano'  } , 
    { id: 3, nacionalidad : 'aleman'  }
  ]);
  nacionalidad = this.nacionalidades.asObservable();

  constructor(private http: HttpClient) {
    this.http.get('http://localhost:8080/nacionalidades').subscribe((informacionServidor: any)=>{
      console.log(informacionServidor);
      this.nacionalidades = informacionServidor;
    });
    

   }

  agregarNacionalidad(nac) {
    this.nacionalidades.next(nac);
  }

}
