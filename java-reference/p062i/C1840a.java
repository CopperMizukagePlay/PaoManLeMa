package p062i;

import java.util.concurrent.Executors;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i.a */
/* loaded from: classes.dex */
public final class C1840a extends AbstractC3393k {

    /* renamed from: t */
    public static volatile C1840a f10907t;

    /* renamed from: s */
    public final Object f10908s;

    public C1840a(int i7) {
        switch (i7) {
            case 1:
                this.f10908s = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1841b());
                return;
            default:
                this.f10908s = new C1840a(1);
                return;
        }
    }
}
