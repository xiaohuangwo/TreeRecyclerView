package com.baozi.demo.item.city;

import com.baozi.demo.R;
import com.baozi.demo.bean.ProvinceBean;
import com.baozi.treerecyclerview.factory.ItemHelperFactory;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.item.TreeItem;
import com.baozi.treerecyclerview.item.TreeItemGroup;

import java.util.List;

/**
 */
public class CountyItemParent extends TreeItemGroup<ProvinceBean.CityBean> {

    @Override
    public List<TreeItem> initChildList(ProvinceBean.CityBean data) {
        return ItemHelperFactory.createItems(data.getAreas(),  this);
    }


    @Override
    public int getLayoutId() {
        return R.layout.item_two;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder) {
        holder.setText(R.id.tv_content, getData().getCityName());
    }
}
