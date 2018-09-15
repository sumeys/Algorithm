package com.sumey.writenExam.aiqiyi;

/**
 * @author sumey
 * @date 2018/9/15 上午11:15
 */

import java.util.*;


/**
 * 局长有N种食物，每种食物有Ai份。
 * <p>
 * 每天局长会吃一份食物，或者买一份食物（即每天只能进行吃或买其中的一种动作），这样过了M天
 * <p>
 * 现在局长想知道M天后第p种食物的份数排名（从大到小，相同算并列，例如3 3 2，则排名为1 1 3）
 * <p>
 * N,M,P<=100,Ai<=1000
 */

/**
 * 输入：第一行N M P
 * <p>
 * 第二行N个数Ai
 * <p>
 * 接下来M行，每行A i或者B i分别表示买一份食物i，吃一份食物i
 * <p>
 * 样例输入：
 * 3 4 2
 * 5 3 1
 * B 1
 * A 2
 * A 2
 * A 3
 * <p>
 * 输出：1
 */

//AC100%
public class Food {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int foodType = in.nextInt();
        int days = in.nextInt();
        int seq = in.nextInt();

        int[] foodNum = new int[foodType];
        for (int i = 0; i < foodType; i++) {
            foodNum[i] = in.nextInt();
        }

        for (int i = 0; i < days; i++) {
            char op = in.next().charAt(0);
            int num = in.nextInt();
            if (op == 'A') {
                foodNum[num - 1]++;
            } else if (op == 'B') {
                foodNum[num - 1]--;
            }
        }

        int value = foodNum[seq - 1];

        HashMap<Integer, Integer> foodMap = new HashMap<Integer, Integer>();
        for (int x : foodNum
                ) {
            if (foodMap.containsKey(x)) {
                int num = foodMap.get(x);
                num += 1;
                foodMap.put(x, num);
            } else if (!foodMap.containsKey(x)) {
                foodMap.put(x, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : foodMap.entrySet()) {
            if (entry.getKey() > value) {
                count += entry.getValue();
            }
        }

        System.out.println(count + 1);
    }

}






