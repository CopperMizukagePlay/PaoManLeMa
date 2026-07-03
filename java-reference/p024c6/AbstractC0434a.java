package p024c6;

import java.nio.charset.Charset;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0434a {

    /* renamed from: a */
    public static final Charset f1477a;

    /* renamed from: b */
    public static final Charset f1478b;

    /* renamed from: c */
    public static volatile Charset f1479c;

    /* renamed from: d */
    public static volatile Charset f1480d;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC3367j.m5099d(forName, "forName(...)");
        f1477a = forName;
        AbstractC3367j.m5099d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC3367j.m5099d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC3367j.m5099d(Charset.forName("UTF-16LE"), "forName(...)");
        Charset forName2 = Charset.forName("US-ASCII");
        AbstractC3367j.m5099d(forName2, "forName(...)");
        f1478b = forName2;
        AbstractC3367j.m5099d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
