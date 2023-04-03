package com.example.readingapp;

import android.widget.Filter;

import com.example.readingapp.model.Category;

import java.util.ArrayList;

public class FilterCategory extends Filter {
    private ArrayList<Category> filterList;
    private CategoryAdapter categoryAdapter;

    public FilterCategory(ArrayList<Category> filterList, CategoryAdapter categoryAdapter) {
        this.filterList = filterList;
        this.categoryAdapter = categoryAdapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if(constraint != null && constraint.length() > 0){
            constraint = constraint.toString().toUpperCase();
            ArrayList<Category> modelFilter = new ArrayList<>();
            for (int i=0; i<filterList.size(); i++){
                if(filterList.get(i).getCategory().toUpperCase().contains(constraint)){
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
        categoryAdapter.categoryList = (ArrayList<Category>) results.values;
        categoryAdapter.notifyDataSetChanged();
    }
}
