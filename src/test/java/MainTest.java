import com.hopochuan.util.CombinationUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

/**
 * @program: letter_combinations
 * @description:
 * @author: liucc@topband.com.cn
 * @create: 2019-05-30 14:10
 **/

public class MainTest {

    private static CombinationUtil combinationUtil;

    @BeforeClass
    public static void initUtil() {
        combinationUtil = new CombinationUtil();
    }

    @Test
    public void testCombin() {
        List<Set<String>> list = new ArrayList<>();
        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(new String[]{"A","B","C"}));
        Set<String> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(new String[]{"D","E","F"}));
        list.add(s1);
        list.add(s2);
        List<String> r1 = combinationUtil.combin(list);
        assertEquals(r1.size(), 9);

        Set<String> s3 = new HashSet<>();
        s3.addAll(Arrays.asList(new String[]{"G","H","I"}));
        list.add(s3);
        List<String> r2 = combinationUtil.combin(list);
        assertEquals(r2.size(), 27);
    }

    @Test
    public void testSortString() {
        String origin = "BAC";
        assertEquals(combinationUtil.sortString(origin), "abc");
    }

    @Test
    public void test1() {
        int[] digits = new int[] {2, 3};
        List<String> list = combinationUtil.combinLetter(digits);
        System.out.println(list);
    }

    @Test
    public void test2() {
        int[] digits = new int[] {9};
        List<String> list = combinationUtil.combinLetter(digits);
        System.out.println(list);
    }

    @Test
    public void test3() {
        int[] digits = new int[] {9, 99, 52};
        List<String> list = combinationUtil.combinLetter(digits);
        System.out.println(list);
    }

    @AfterClass
    public static void destroyUtil() {
        combinationUtil = null;
    }
}
