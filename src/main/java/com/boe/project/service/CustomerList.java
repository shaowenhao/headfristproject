package com.boe.project.service;

import com.boe.project.bean.Customer;

/**
 * Description: 为Customer对象的管理模块，内部用数组管理一组Customer对象
 * 并提供添加，修改，删除和遍历方法 供CustomerView调用
 * date: 2020 2020/8/5 15:08
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0; //记录已保存客户的数量

    /**
     * 初始化customers数组的构造器
     * @param totalCustomer 制定数组长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) return false;

        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) return false;

        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;

        //终止的条件 让它取到最后一个元素 可以先放一放
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];     //这个先写出来 反推
        }

       // customers[--total] = null;
        // 最后有数据的元素需要置空 add ++ delete --
        customers[total - 1] = null;
        total--;

        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public int getTotal() {
        return total;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;

        return customers[index];
    }
}
