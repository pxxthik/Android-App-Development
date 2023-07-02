package com.sxnu.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerContact;
    ArrayList<ContactModel> arrayContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerContact = findViewById(R.id.recyclerContact);

        recyclerContact.setLayoutManager(new LinearLayoutManager(this));

        arrayContacts.add(new ContactModel("Sergio Marquina", "8956349765"));
        arrayContacts.add(new ContactModel("Orturo Roman", "6754986743"));
        arrayContacts.add(new ContactModel("Monika Gastambide", "8956349765"));
        arrayContacts.add(new ContactModel("Angel Rubio", "8956349765"));
        arrayContacts.add(new ContactModel("Andres de Fonouosa", "8956349765"));
        arrayContacts.add(new ContactModel("Martin", "8956349765"));
        arrayContacts.add(new ContactModel("Alicia Ciara", "8956349765"));
        arrayContacts.add(new ContactModel("Cornel Tammayo", "8956349765"));
        arrayContacts.add(new ContactModel("Siliviya Olivira", "8956349765"));
        arrayContacts.add(new ContactModel("Raquil Murillo", "8956349765"));
        arrayContacts.add(new ContactModel("Swares", "8956349765"));
        arrayContacts.add(new ContactModel("Marsellia", "8956349765"));
        arrayContacts.add(new ContactModel("Antoniansas", "8956349765"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrayContacts);
        recyclerContact.setAdapter(adapter);

    }
}