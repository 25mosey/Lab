package com.example.lab3

import android.app.Dialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.app.Activity
import android.graphics.Color
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class InputActivity : AppCompatActivity() {
    private lateinit var red:RadioButton
    private lateinit var green: RadioButton
    private lateinit var blue:RadioButton
    private lateinit var okButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            val builder = AlertDialog.Builder(activity)
            val inflater = requireActivity().layoutInflater

            // Инфлейт разметки диалогового окна
            val dialogView = inflater.inflate(R.layout.dialog_layout, null)

            // Инициализация элементов разметки
            val checkBoxUp = dialogView.findViewById<CheckBox>(R.id.checkbox_up)
            val checkBoxDown = dialogView.findViewById<CheckBox>(R.id.checkbox_down)
            val radioGroupColors = dialogView.findViewById<RadioGroup>(R.id.radio_group_colors)
            val buttonOk = dialogView.findViewById<Button>(R.id.button_ok)

            // Обработка нажатия на кнопку ОК
            buttonOk.setOnClickListener {
                // Получение выбранных значений
                val isUpChecked = checkBoxUp.isChecked
                val isDownChecked = checkBoxDown.isChecked
                val selectedColorId = radioGroupColors.checkedRadioButtonId
                val selectedColor = when (selectedColorId) {
                    R.id.radio_red -> Color.RED
                    R.id.radio_green -> Color.GREEN
                    R.id.radio_blue -> Color.BLUE
                    else -> Color.BLACK
                }
    }

}