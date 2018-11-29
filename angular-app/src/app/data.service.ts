import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Usuario } from 'src/app/modelo/usuario';
import { HttpHeaders } from '@angular/common/http';



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
  private nombreUsuario = new BehaviorSubject('');
  nombre = this.nombreUsuario.asObservable();

  

  constructor(private http: HttpClient) {
  
    //  this.http.get('http://localhost:8080/nacionalidades').subscribe((informacionServidor: any)=>{
    //  console.log(informacionServidor);
      //this.nacionalidades = informacionServidor;
 //   });
    
   }

 // public agregarNacionalidad(nac) {
  public getNacionalidades() : Observable<any> {   
   return this.http.get('http://localhost:8080/nacionalidades');
  }
  public login(usuario:Usuario){
    const httpOptions = {
      headers : new HttpHeaders({
        'Context-Type' : 'application/json'
      })
    };
    try{
      this.http.post('http://localhost:8080/login', usuario, httpOptions).subscribe(
      res =>{
        console.log(res);
    });
    }catch(err) {
      console.log(err);
    }
     
  }

}
