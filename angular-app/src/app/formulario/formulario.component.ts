import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
import {BehaviorSubject } from 'rxjs'
import { Nacionalidad } from 'src/app/modelo/nacionalidad';
import { Usuario } from 'src/app/modelo/usuario';
import { and } from '@angular/router/src/utils/collection';
@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  public nombre: string = '';
  public apellido: string = '';
  public idNacionalidad: number = 0;
  public id = 0;
  public variable: string = '';



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
    console.log("Se recibio nombre: " + this.nombre + " apellido: " + this.apellido + this.idNacionalidad + this.id);
    if (this.nombre == " " || this.id == null){
      console.log("Faltan datos del nombre");
      this.variable = "Faltan datos del nombre";
    }
    else{
      let user : Usuario = { 
        'apellido' : this.apellido,
        'nombre' : this.nombre,
        'nacionalidad' : this.idNacionalidad,
        'id' : this.id
      };
      this._data.login(user);
    }  
 }



}
