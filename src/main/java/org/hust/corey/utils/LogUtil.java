package org.hust.corey.utils;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HUST Corey on 2019-03-15.
 */
public class LogUtil {
    public static final Integer error = 2;
    public static final Integer warning = 1;
    public static final Integer info = 0;
    private static Map<Integer,String> levelMap;
    static{
        levelMap = new HashMap<>();
        levelMap.put(LogUtil.info,"info");
        levelMap.put(LogUtil.warning,"warning");
        levelMap.put(LogUtil.error,"error");
    }

    /**
     * get log string with level info
     * @param msg message to log
     * @return string of log
     */
    public String getLog(String msg){
        return getLog(msg,LogUtil.info);
    }

    /**
     * get log
     * @param msg message to log
     * @param level log level {LogUtil.info, LogUtil.warning, LogUtil.error}
     * @return string of log
     */
    public String getLog(String msg, Integer level){
        if(!levelMap.containsKey(level))
            level = LogUtil.info;
        LocalDateTime now = LocalDateTime.now();
        return String.format("<%s> %s %s : %s\n",
                levelMap.get(level),
                now.toLocalDate().toString(),
                now.toLocalTime().toString(),
                msg);
    }


}
