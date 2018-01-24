package com.example.t00551333.calculator;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonMC, buttonMR, buttonMmin, buttonMplus, buttonC;
    Button buttonPercent, buttonPlusmin, buttonAdd, buttonSub, buttonMult;
    Button buttonDiv, buttonDec, buttonEqu, button1, button2;
    Button button3, button4, button5, button6, button7;
    Button button8, button9, button0;
    TextView textView;
    DecimalFormat f = new DecimalFormat("#.####");
    private String saveString, memory;
    private float num1 = 0, num2 = 0, tot = 0, mem;
    private boolean func, boolnum, booltot, div, mult, add, sub, neg, dec, per, equ, boolfirst = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            mem = savedInstanceState.getFloat(memory);
        }
        boolfirst = true;

        textView = (TextView) findViewById(R.id.textView);
        buttonMC = (Button) findViewById(R.id.button01);
        buttonMC.setOnClickListener(this);
        buttonMR = (Button) findViewById(R.id.button02);
        buttonMR.setOnClickListener(this);
        buttonMmin = (Button) findViewById(R.id.button03);
        buttonMmin.setOnClickListener(this);
        buttonMplus = (Button) findViewById(R.id.button04);
        buttonMplus.setOnClickListener(this);
        buttonC = (Button) findViewById(R.id.button05);
        buttonC.setOnClickListener(this);
        buttonPercent = (Button) findViewById(R.id.button06);
        buttonPercent.setOnClickListener(this);
        buttonPlusmin = (Button) findViewById(R.id.button07);
        buttonPlusmin.setOnClickListener(this);
        buttonAdd = (Button) findViewById(R.id.button08);
        buttonAdd.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button09);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button10);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button11);
        button3.setOnClickListener(this);
        buttonSub = (Button) findViewById(R.id.button12);
        buttonSub.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button13);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button14);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button15);
        button6.setOnClickListener(this);
        buttonMult = (Button) findViewById(R.id.button16);
        buttonMult.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button17);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button18);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button19);
        button9.setOnClickListener(this);
        buttonDiv = (Button) findViewById(R.id.button20);
        buttonDiv.setOnClickListener(this);
        button0 = (Button) findViewById(R.id.button21);
        button0.setOnClickListener(this);
        buttonDec = (Button) findViewById(R.id.button22);
        buttonDec.setOnClickListener(this);
        buttonEqu = (Button) findViewById(R.id.button23);
        buttonEqu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(func || booltot || boolfirst || equ) {
            switch (view.getId()) {

                case R.id.button09:
                    textView.setText("1");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button10:
                    textView.setText("2");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button11:
                    textView.setText("3");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button13:
                    textView.setText("4");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button14:
                    textView.setText("5");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button15:
                    textView.setText("6");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button17:
                    textView.setText("7");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button18:
                    textView.setText("8");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button19:
                    textView.setText("9");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button21:
                    textView.setText(" 0");
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button22:
                    textView.setText("0.");
                    dec = true;
                    booltot = false;
                    boolfirst = false;
                    equ = false;
                    func = false;
                    break;

                case R.id.button05:
                    booltot = false;
                    boolnum = false;
                    per = false;
                    add = false;
                    sub = false;
                    mult = false;
                    div = false;
                    dec = false;
                    equ = false;
                    func = false;
                    neg = false;
                    boolfirst = true;
                    textView.setText("0");
                    break;

                case R.id.button07:
                    if(!neg) {
                        textView.setText("-" + textView.getText());
                        neg = true;
                    }else {
                        textView.setText(textView.getText().toString().replace("-", ""));
                        neg = false;
                    }
                    break;

                case R.id.button01:
                    mem = 0;
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button02:
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button03:
                    mem -= Float.parseFloat((String) textView.getText());
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button04:
                    mem += Float.parseFloat((String) textView.getText());
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                default:
                    break;
            }
        }
        else {
            switch (view.getId()) {

                case R.id.button09:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "1");
                    }else{
                        textView.setText("1");
                    }
                    break;

                case R.id.button10:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "2");
                    }else{
                        textView.setText("2");
                    }
                    break;

                case R.id.button11:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "3");
                    }else{
                        textView.setText("3");
                    }
                    break;

                case R.id.button13:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "4");
                    }else{
                        textView.setText("4");
                    }
                    break;

                case R.id.button14:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "5");
                    }else{
                        textView.setText("5");
                    }
                    break;

                case R.id.button15:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "6");
                    }else{
                        textView.setText("6");
                    }
                    break;

                case R.id.button17:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "7");
                    }else{
                        textView.setText("7");
                    }
                    break;

                case R.id.button18:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "8");
                    }else{
                        textView.setText("8");
                    }
                    break;

                case R.id.button19:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "9");
                    }else{
                        textView.setText("9");
                    }
                    break;

                case R.id.button21:
                    if(textView.getText() != " 0"){
                        textView.setText(textView.getText() + "0");
                    }
                    break;

                case R.id.button22:
                    if(!dec) {
                        textView.setText(textView.getText() + ".");
                        dec = true;
                    }
                    break;
//Clear
                case R.id.button05:
                    booltot = false;
                    boolnum = false;
                    per = false;
                    add = false;
                    sub = false;
                    mult = false;
                    div = false;
                    dec = false;
                    equ = false;
                    func = false;
                    neg = false;
                    boolfirst = true;
                    textView.setText("0");
                    break;

                case R.id.button07:
                    if(!neg) {
                        textView.setText("-" + textView.getText());
                        neg = true;
                    }
                    else {
                        textView.setText(textView.getText().toString().replace("-", ""));
                        neg = false;
                    }
                    break;
//Percentage
                case R.id.button06:
                    if(boolnum){
                        equalFunc(num1, num2);
                        num1 = tot;
                        per = true;
                        booltot = true;
                        func = true;
                        dec = false;
                        neg = false;
                    }
                    else{
                        num1 = Float.parseFloat((String) textView.getText());
                        per = true;
                        dec = false;
                        func = true;
                        boolnum = true;
                        neg = false;
                    }
                    break;
//Addition
                case R.id.button08:
                    if(boolnum){
                        equalFunc(num1, num2);
                        num1 = tot;
                        booltot = true;
                        add = true;
                        func = true;
                        dec = false;
                        neg = false;
                    }
                    else{
                        num1 = Float.parseFloat((String) textView.getText());
                        add = true;
                        dec = false;
                        func = true;
                        boolnum = true;
                        neg = false;
                    }
                    break;
//Subtraction
                case R.id.button12:
                    if(boolnum){
                        equalFunc(num1, num2);
                        num1 = tot;
                        sub = true;
                        booltot = true;
                        func = true;
                        dec = false;
                        neg = false;
                    }
                    else{
                        num1 = Float.parseFloat((String) textView.getText());
                        func = true;
                        sub = true;
                        dec = false;
                        boolnum = true;
                        neg = false;
                    }
                    break;
//Multiplication
                case R.id.button16:
                    if(boolnum){
                        equalFunc(num1, num2);
                        num1 = tot;
                        mult = true;
                        booltot = true;
                        func = true;
                        dec = false;
                        neg = false;
                    }
                    else{
                        num1 = Float.parseFloat((String) textView.getText());
                        func = true;
                        mult = true;
                        dec = false;
                        boolnum = true;
                        neg = false;
                    }
                    break;
//Division
                case R.id.button20:
                    if(boolnum){
                        equalFunc(num1, num2);
                        num1 = tot;
                        div = true;
                        booltot = true;
                        func = true;
                        dec = false;
                        neg = false;
                    }
                    else{
                        num1 = Float.parseFloat((String) textView.getText());
                        func = true;
                        div = true;
                        dec = false;
                        boolnum = true;
                        neg = false;
                    }
                    break;
//Equals
                case R.id.button23:
                    equalFunc(num1, num2);
                    booltot = true;
                    break;
//Memory
                case R.id.button01:
                    mem = 0;
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button02:
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button03:
                    mem -= Float.parseFloat((String) textView.getText());
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                case R.id.button04:
                    mem += Float.parseFloat((String) textView.getText());
                    textView.setText(String.valueOf(f.format(mem)));
                    func = true;
                    break;

                default:
                    break;
            }
        }
    }

    public float equalFunc(float x, float y){
        num2 = Float.parseFloat((String) textView.getText());
        if(per){
            tot = (num1/100) * num2;
            textView.setText(String.valueOf(f.format(tot)));
            per = false;
            dec = false;
            neg = false;
        }else if(add){
            tot = num1 + num2;
            textView.setText(String.valueOf(f.format(tot)));
            add = false;
            dec = false;
            neg = false;
        }else if(sub){
            tot = num1 - num2;
            textView.setText(String.valueOf(f.format(tot)));
            sub = false;
            dec = false;
            neg = false;
        }else if(mult){
            tot = num1 * num2;
            textView.setText(String.valueOf(f.format(tot)));
            mult = false;
            dec = false;
            neg = false;
        }else if(div) {
            if(num2 == 0){
                textView.setText("Error");
                neg = false;
            }else {
                tot = num1 / num2;
                textView.setText(String.valueOf(f.format(tot)));
                dec = false;
                neg = false;
            }
            div = false;
        }
        equ = true;
        return tot;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putFloat(memory, mem);
        savedInstanceState.putString(saveString, textView.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString(saveString));
    }
}