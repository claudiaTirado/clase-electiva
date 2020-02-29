package co.edu.cecar.academica.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import co.edu.cecar.academica.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentViewModel = ViewModelProvider(this).get(StudentViewModel::class.java)
        val student = studentViewModel.getStudents()

   val studentAdapter = StudentAdapter(student)
        rvStudents.apply {
            adapter=studentAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


    }
}
