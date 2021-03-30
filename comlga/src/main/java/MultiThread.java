import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author lga
 * @date 2021-03-04 14:38
 * @desc
 */
public class MultiThread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo:threadInfos
             ) {
            System.out.println("{"+threadInfo.getThreadId()+"}" + threadInfo.getThreadName());
        }
    }
}
