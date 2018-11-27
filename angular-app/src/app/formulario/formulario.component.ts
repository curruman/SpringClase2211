import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
import {BehaviorSubject } from 'rxjs'
import { Nacionalidad } from 'src/app/modelo/nacionalidad';
import { Usuario } from 'src/app/modelo/usuario';
@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  public nombre: string = '';
  public apellido: string = '';
  public idNacionalidad: number = 1;



  public nacionalidades : Nacionalidad [] = []; 
  //  { id: 1, nacionalidad : 'argentino'  }, 
    //{ id: 2, nacionalidad : 'venezolano'  } , 
   // { id: 3, nacionalidad : 'aleman'  }
 // ];

  constructor( private _data: DataService ) {
   
  }

  ngOnInit() {
    this._data.getNacionalidades().subscribe(
      (res:any)=>{
        console.log(res);
        this.nacionalidades = res;
    });
  }

  public enviar() :void {
    console.log("Se recibio nombre: " + this.nombre + " apellido: " + this.apellido + this.idNacionalidad );
    let user : Usuario = new Usuario();
    user.apellido = this.apellido;
    user.nombre = this.nombre;
    user.nacionalidad = this.idNacionalidad;

    this._data.login(user);
 }


}
