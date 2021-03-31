/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Nomor4;

/**
 *
 * @author PERSONAL
 */
public class DataArray {
    public int [] bubbleSort(int [] data){
        for (int i=0; i < data.length-1; i++){
            for(int j = 1; j < data.length-1; j++){
                if (data [j] < data [j-1]){
                    int tmp = data [j];
                    data [j] = data [j-1];
                    data [j-1] = tmp;
                }
            }
        }
        return data;
    }
    public int JmlBinarySearch(int [] temp,int cari, int right, int left, int jml){
        int mid;
        if (right >= left){
            mid = (right + left) / 2;
            if (cari == temp[mid]){
                jml++;
                return JmlBinarySearch(temp, cari, mid+1, right, left);        
            }else if(temp[mid]>cari){
                return JmlBinarySearch(temp, cari, mid-1, right, left);
            }else{
                return JmlBinarySearch(temp, cari, mid-1, right, left);
            }
        }
        if (right == left){
            if (cari == temp [left]){
                jml++;
                return jml;
            }
        }
        return jml;
    }
    public int[] IdxBinarySearch(int[] temp, int cari, int right, int left, int[] idx, int index){
        int mid;
        if (right >= left){
            mid = (right + left) / 2;
            if( cari == temp[mid]){
                idx[index] = mid;
                index++;
                return IdxBinarySearch( temp, cari, mid+1, right, idx, index);
            }else if(temp[mid] > cari){
                return IdxBinarySearch(temp, cari, left, mid-1, idx, index);
            }else{
                return IdxBinarySearch(temp, cari, left, mid-1, idx, index);
            }
        }
        if (right == left){
            if(cari == temp[left]){
                idx[index] = left;
                return idx;
            }
        }
        return idx;
    }
}


