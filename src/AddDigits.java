/**
 * Created by xianggao on 16/1/22.
 * 枚举法, 1-9各位返回本值
 * 10->11 ....   19->1
 */
public class AddDigits {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }else return (num - 1) % 9 + 1;
    }
}
