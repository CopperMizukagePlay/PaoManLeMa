package p141s3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p006a7.C0129l;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s3.a */
/* loaded from: classes.dex */
public final class C3108a {

    /* renamed from: a */
    public final C0129l f15712a = new C0129l(29);

    /* renamed from: b */
    public final LinkedHashMap f15713b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashSet f15714c = new LinkedHashSet();

    /* renamed from: d */
    public volatile boolean f15715d;

    /* renamed from: a */
    public static void m4807a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC2487d.m4053q(autoCloseable);
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }
}
