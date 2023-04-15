package edu.vassar.cmpu203.triviagame;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.triviagame.databinding.FragmentActiveQuestionBinding;


public class ActiveQuestion extends Fragment implements IActiveQuestionView{

    private FragmentActiveQuestionBinding binding;
    private Listener listener;

    public ActiveQuestion(){}

    public ActiveQuestion(Listener listener){
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        this.binding = FragmentActiveQuestionBinding.inflate(inflater);
        return this.binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        String qNumber = "" + numQuestion();
        this.binding.numCount.setText(qNumber);
    }

    public int numQuestion(){
        return this.listener.questionNumber();
    }
}

