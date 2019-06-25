package org.unitec.califitec

import android.app.Activity
import android.content.Context
import android.os.AsyncTask
import kotlinx.android.synthetic.main.activity_main.*

class TareaAutenticarAlumno(var ctx: Context?, var activity: MainActivity?):
AsyncTask<Void,Void,Void>(){
    var alumno=Alumno()

    //En este le pedimos la informacion a la interfaz de usuario (si es que la hay)
    override fun onPreExecute() {
        super.onPreExecute()
        //Preparamos al alumno a partir de la info de la intefaz de usuario
      alumno.email=  activity?.txtEmail?.text.toString()
      alumno.cuenta=activity?.txtPassword?.text.toString()

    }
//Este es olbigatorio!! y aqui si es importante tener este metodo
    //este somete a informacion al back-end
    override fun doInBackground(vararg p0: Void?): Void? {

   // Aqui vamos a preparar nuestro objeto alumno que ya tenemos para enviar a
    // El back-end
    //Aqui usaremos la bibloteca REtrofir que es muy iportante
return null

    }

   //ESte método una vez que se obtenga la respuesta del back end se informa
    //nuevamente en la interfaz de usuario la info aqui, por ejemplo,
    //navegacion hacia otra pagina
    override fun onPostExecute(result: Void?) {
        super.onPostExecute(result)
    }
}