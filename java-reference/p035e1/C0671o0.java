package p035e1;

import android.graphics.Shader;
import p023c5.C0427s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.o0 */
/* loaded from: classes.dex */
public final class C0671o0 extends AbstractC0670o {

    /* renamed from: a */
    public final long f2197a;

    public C0671o0(long j6) {
        this.f2197a = j6;
    }

    @Override // p035e1.AbstractC0670o
    /* renamed from: a */
    public final void mo1444a(float f7, long j6, C0427s c0427s) {
        c0427s.m908g(1.0f);
        long j7 = this.f2197a;
        if (f7 != 1.0f) {
            j7 = C0677s.m1453b(C0677s.m1455d(j7) * f7, j7);
        }
        c0427s.m910i(j7);
        if (((Shader) c0427s.f1463h) != null) {
            c0427s.m913l(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0671o0)) {
            return false;
        }
        if (C0677s.m1454c(this.f2197a, ((C0671o0) obj).f2197a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f2197a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0677s.m1460i(this.f2197a)) + ')';
    }
}
