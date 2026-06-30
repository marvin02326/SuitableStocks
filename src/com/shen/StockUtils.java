package com.shen.utils;

import java.util.List;

/**
 * 股票数据分析辅助工具类
 * 用于计算基本的统计数据
 */
public class StockUtils {

    /**
     * 计算一组double数据的平均值
     * @param data 数据列表
     * @return 平均值，如果列表为空则返回0
     */
    public static double calculateAverage(List<Double> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (Double value : data) {
            sum += value;
        }
        
        return sum / data.size();
    }

    /**
     * 找出数据中的最大值
     * @param data 数据列表
     * @return 最大值
     */
    public static double findMax(List<Double> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }
        double max = data.get(0);
        for (Double val : data) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
