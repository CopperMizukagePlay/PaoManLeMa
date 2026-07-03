package p167v6;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p024c6.AbstractC0444k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.d */
/* loaded from: classes.dex */
public final class C3602d extends Handler {

    /* renamed from: a */
    public static final C3602d f17251a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i7;
        int min;
        AbstractC3367j.m5100e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC3601c.f17249a;
        String loggerName = logRecord.getLoggerName();
        AbstractC3367j.m5099d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i7 = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        String message = logRecord.getMessage();
        AbstractC3367j.m5099d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) AbstractC3601c.f17250b.get(loggerName);
        if (str == null) {
            str = AbstractC0444k.m955s0(loggerName, 23);
        }
        if (Log.isLoggable(str, i7)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int m934X = AbstractC0444k.m934X(message, '\n', i8, 4);
                if (m934X == -1) {
                    m934X = length;
                }
                while (true) {
                    min = Math.min(m934X, i8 + 4000);
                    String substring = message.substring(i8, min);
                    AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i7, str, substring);
                    if (min >= m934X) {
                        break;
                    } else {
                        i8 = min;
                    }
                }
                i8 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
