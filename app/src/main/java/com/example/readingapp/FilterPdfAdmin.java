package com.example.readingapp;

import android.widget.Filter;

import com.example.readingapp.adapters.AdapterPdfAdmin;
import com.example.readingapp.adapters.CategoryAdapter;
import com.example.readingapp.model.Category;

import java.util.ArrayList;

public class FilterPdfAdmin extends Filter {
    ArrayList<ModelPdf> filterList;
    AdapterPdfAdmin adapterPdfAdmin;

    public FilterPdfAdmin(ArrayList<ModelPdf> filterList, AdapterPdfAdmin adapterPdfAdmin) {
        this.filterList = filterList;
        this.adapterPdfAdmin = adapterPdfAdmin;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if(constraint != null && constraint.length() > 0){
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelPdf> modelFilter = new ArrayList<>();
            for (int i=0; i<filterList.size(); i++){
                if(filterList.get(i).getTitle().toUpperCase().contains(constraint)){
                    modelFilter.add(filterList.get(i));
                }
            }

            results.count = modelFilter.size();
            results.values = modelFilter;
        }
        else {
            results.count = filterList.size();
            results.values = filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapterPdfAdmin.pdfArrayList = (ArrayList<ModelPdf>) results.values;
        adapterPdfAdmin.notifyDataSetChanged();
    }
}
