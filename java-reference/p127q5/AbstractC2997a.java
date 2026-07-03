package p127q5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2997a {

    /* renamed from: a */
    public static final Integer f15464a;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f15464a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f15464a = num2;
    }
}
