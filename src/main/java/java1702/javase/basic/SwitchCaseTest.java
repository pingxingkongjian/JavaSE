package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by HP on 2017/3/10.
 */
// 接收用户输入的一个字母 A B C D..., 输出分数区间[90,100],[80,90),[60,80),[0,60)
public class SwitchCaseTest { // 多分枝选择结构
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D: ");
        String s = scanner.nextLine();
        System.out.println(s);

        switch (s) { // 开关\ [swɪtʃ]
            case "A": // 情况下\ [keɪs]
                System.out.println("[90,100]");
                break; // 打破\ [breɪk]
            case "B":
                System.out.println("[80,90)");
                break;
            case "C":
                System.out.println("[60,80)");
                break;
            case "D":
                System.out.println("[0,60)");
                break;
            default: // 默认的\ [dɪ'fɔːlt\;\ 'diːfɔːlt]
                System.out.println("default...");
                break;
        }
    }
}
