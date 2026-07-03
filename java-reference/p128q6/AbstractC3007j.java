package p128q6;

import java.net.Proxy;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.j */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3007j {

    /* renamed from: a */
    public static final /* synthetic */ int[] f15512a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15512a = iArr;
    }
}
