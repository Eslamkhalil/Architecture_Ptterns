package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alyndroid.architecturepatternstutorialshomework.database.DataBase;


public class ViewModelData extends ViewModel {

  public MutableLiveData<Integer> stringMutableLiveData = new MutableLiveData<>();
  public void sumNumbers (){
    stringMutableLiveData.setValue(DataBase.getNumbers().getFirstNum()+ DataBase.getNumbers().getSecondNum());
  }
  public void divNumbers (){
    stringMutableLiveData.setValue(DataBase.getNumbers().getFirstNum() / DataBase.getNumbers().getSecondNum());

  }
  public void mulNumbers (){
    stringMutableLiveData.setValue(DataBase.getNumbers().getFirstNum() * DataBase.getNumbers().getSecondNum());

  }


}
