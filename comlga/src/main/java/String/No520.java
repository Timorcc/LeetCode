package String;

/**
 * @author lga
 * @create 2020/10/4 0004
 * @desc 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 **/
public class No520 {
    public boolean detectCapitalUse(String word) {
//        if (word.length() == 1) {
//            return true;
//        }
//        boolean first = word.charAt(0) >= 97;
//        //首字母小写
//        if (first) {
//            for (char s : word.toCharArray()
//            ) {
//                if (s < 97) {
//                    return false;
//                }
//            }
//        }
//        //首字母大写
//        else {
//            //第二个字母是小写
//            if (word.charAt(1) >= 97) {
//                for (int i = 2; i < word.length(); i++) {
//                    if (word.charAt(i) < 97) {
//                        return false;
//                    }
//                }
//            }
//            //第二个字母是大写
//            if (word.charAt(1) < 97) {
//                for (int i = 2; i < word.length(); i++) {
//                    if (word.charAt(i) >= 97) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
        //大写字母的个数
        if (word.length() == 1) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 97) {
                count++;
            }
        }
        //全大写
        if (count == word.length() || count == 0) {
            return true;
        }
        //首字母大写
        if (count == 1 && word.charAt(0) < 97) {
            return true;
        }

        return false;

    }
}
