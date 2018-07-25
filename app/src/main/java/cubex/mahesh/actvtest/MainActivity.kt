package cubex.mahesh.actvtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 //       var values = resources.getStringArray(R.array.countries)
        var values = arrayOf("South Africa","Saudi Arebia","Swedan")
        var myadapter = ArrayAdapter<String>(this@MainActivity,
                 android.R.layout.simple_list_item_single_choice,values)
        actv.setAdapter(myadapter)
        actv.threshold = 1

        sp1.setOnItemSelectedListener(
                object : AdapterView.OnItemSelectedListener {
                    override fun onNothingSelected(p0: AdapterView<*>?) {

                    }

                    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                        Toast.makeText(this@MainActivity,
                                sp1.selectedItem.toString(),
                                Toast.LENGTH_LONG).show()

                    }

                })
    }
}
