package p039e5;

import android.os.Process;
import android.os.SystemClock;
import p077k.AbstractC2206n0;
import p077k.C2186d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x1 */
/* loaded from: classes.dex */
public final class C1414x1 {

    /* renamed from: a */
    public long f8578a;

    /* renamed from: b */
    public long f8579b;

    /* renamed from: c */
    public final Object f8580c;

    /* renamed from: d */
    public Object f8581d;

    public C1414x1(int i7) {
        switch (i7) {
            case 1:
                int i8 = AbstractC2206n0.f12715a;
                this.f8580c = new C2186d0(6);
                this.f8581d = new C2186d0(6);
                return;
            default:
                this.f8580c = new Object();
                this.f8581d = new C1383w1();
                return;
        }
    }

    /* renamed from: a */
    public static final long m2420a(C1414x1 c1414x1, long j6, long j7) {
        c1414x1.getClass();
        if (j7 == 0) {
            return j6;
        }
        long j8 = 4;
        return (j6 / j8) + ((j7 / j8) * 3);
    }

    /* renamed from: b */
    public void m2421b() {
        synchronized (this.f8580c) {
            this.f8578a = Process.getElapsedCpuTime();
            this.f8579b = SystemClock.elapsedRealtime();
            this.f8581d = new C1383w1();
        }
    }
}
