package p039e5;

import p024c6.AbstractC0444k;
import p024c6.C0442i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z8 */
/* loaded from: classes.dex */
public abstract class AbstractC1483z8 {

    /* renamed from: a */
    public static final C0442i f9834a = new C0442i("https?://[^\\s'\\\",，。；（）【】《》]+", 0);

    /* renamed from: b */
    public static final C0442i f9835b = new C0442i("(?:-H|--header)\\s+(?:'([^']*)'|\\\"([^\\\"]*)\\\"|(\\S+))", 0);

    /* renamed from: a */
    public static String m2436a(String str) {
        return AbstractC0444k.m959w0(str, ',', '.', ';', ')', ']', '}', 65292, 12290, 65307, 65289, 12305, 12299);
    }
}
