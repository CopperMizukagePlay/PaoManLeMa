package p160v;

import androidx.compose.foundation.lazy.layout.C0156a;
import java.util.Arrays;
import java.util.List;
import p001a0.C0053n;
import p032d6.InterfaceC0516a0;
import p035e1.InterfaceC0682x;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p152u.C3326n;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.a0 */
/* loaded from: classes.dex */
public final class C3397a0 {

    /* renamed from: b */
    public C3091a f16498b;

    /* renamed from: c */
    public int f16499c;

    /* renamed from: d */
    public int f16500d;

    /* renamed from: f */
    public int f16502f;

    /* renamed from: g */
    public int f16503g;

    /* renamed from: h */
    public final /* synthetic */ C0156a f16504h;

    /* renamed from: a */
    public C3444x[] f16497a = AbstractC3405d0.f16533a;

    /* renamed from: e */
    public int f16501e = 1;

    public C3397a0(C0156a c0156a) {
        this.f16504h = c0156a;
    }

    /* renamed from: b */
    public static void m5158b(C3397a0 c3397a0, C3326n c3326n, InterfaceC0516a0 interfaceC0516a0, InterfaceC0682x interfaceC0682x, int i7, int i8) {
        c3397a0.f16504h.getClass();
        c3397a0.m5159a(c3326n, interfaceC0516a0, interfaceC0682x, i7, i8, (int) (c3326n.m5062a(0) >> 32));
    }

    /* renamed from: a */
    public final void m5159a(C3326n c3326n, InterfaceC0516a0 interfaceC0516a0, InterfaceC0682x interfaceC0682x, int i7, int i8, int i9) {
        C3424n c3424n;
        C3444x[] c3444xArr = this.f16497a;
        int length = c3444xArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                C3444x c3444x = c3444xArr[i10];
                if (c3444x != null && c3444x.f16644g) {
                    break;
                } else {
                    i10++;
                }
            } else {
                this.f16502f = i7;
                this.f16503g = i8;
                break;
            }
        }
        List list = c3326n.f16330b;
        int length2 = this.f16497a.length;
        for (int size = list.size(); size < length2; size++) {
            C3444x c3444x2 = this.f16497a[size];
            if (c3444x2 != null) {
                c3444x2.m5190c();
            }
        }
        if (this.f16497a.length != list.size()) {
            Object[] copyOf = Arrays.copyOf(this.f16497a, list.size());
            AbstractC3367j.m5099d(copyOf, "copyOf(this, newSize)");
            this.f16497a = (C3444x[]) copyOf;
        }
        this.f16498b = new C3091a(c3326n.f16340l);
        this.f16499c = i9;
        this.f16500d = 0;
        this.f16501e = 1;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object mo4921n = ((AbstractC3239v0) list.get(i11)).mo4921n();
            if (mo4921n instanceof C3424n) {
                c3424n = (C3424n) mo4921n;
            } else {
                c3424n = null;
            }
            if (c3424n == null) {
                C3444x c3444x3 = this.f16497a[i11];
                if (c3444x3 != null) {
                    c3444x3.m5190c();
                }
                this.f16497a[i11] = null;
            } else {
                C3444x c3444x4 = this.f16497a[i11];
                if (c3444x4 == null) {
                    c3444x4 = new C3444x(interfaceC0516a0, interfaceC0682x, new C0053n(27, this.f16504h));
                    this.f16497a[i11] = c3444x4;
                }
                c3444x4.f16641d = c3424n.f16595s;
                c3444x4.f16642e = c3424n.f16596t;
                c3444x4.f16643f = c3424n.f16597u;
            }
        }
    }
}
