package br.com.digitalhouse.comunicaoentrefragments.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.comunicaoentrefragments.Model.Pessoa;
import br.com.digitalhouse.comunicaoentrefragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragments extends Fragment {


    public SecondFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_fragments, container, false);

        TextView textViewName = view.findViewById(R.id.TextViewName);
        TextView textViewProfissão = view.findViewById(R.id.TextViewProfession);
        TextView textViewIdade = view.findViewById(R.id.TextViewAge);

        if (getArguments() != null) {
            Pessoa pessoa = getArguments().getParcelable("Pessoa");

            if (pessoa != null) {
                textViewName.setText(pessoa.getNome());
                textViewProfissão.setText(pessoa.getProfissão());
                textViewIdade.setText(pessoa.getIdade() + "Anos");
            }
        }
            return view;
        }

    }
