package p168w;

import java.util.List;
import p122q.EnumC2931o0;
import p140s2.EnumC3103m;
import p146t1.AbstractC3239v0;
import p177x0.C3801i;
import p177x0.InterfaceC3796d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.h */
/* loaded from: classes.dex */
public final class C3625h {

    /* renamed from: a */
    public final int f17302a;

    /* renamed from: b */
    public final List f17303b;

    /* renamed from: c */
    public final long f17304c;

    /* renamed from: d */
    public final Object f17305d;

    /* renamed from: e */
    public final InterfaceC3796d f17306e;

    /* renamed from: f */
    public final C3801i f17307f;

    /* renamed from: g */
    public final EnumC3103m f17308g;

    /* renamed from: h */
    public final boolean f17309h;

    /* renamed from: i */
    public final boolean f17310i;

    /* renamed from: j */
    public final int f17311j;

    /* renamed from: k */
    public final int[] f17312k;

    /* renamed from: l */
    public int f17313l;

    /* renamed from: m */
    public int f17314m;

    public C3625h(int i7, int i8, List list, long j6, Object obj, EnumC2931o0 enumC2931o0, InterfaceC3796d interfaceC3796d, C3801i c3801i, EnumC3103m enumC3103m, boolean z7) {
        boolean z8;
        int i9;
        this.f17302a = i7;
        this.f17303b = list;
        this.f17304c = j6;
        this.f17305d = obj;
        this.f17306e = interfaceC3796d;
        this.f17307f = c3801i;
        this.f17308g = enumC3103m;
        this.f17309h = z7;
        if (enumC2931o0 == EnumC2931o0.f15240e) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f17310i = z8;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i11);
            if (!this.f17310i) {
                i9 = abstractC3239v0.f16054f;
            } else {
                i9 = abstractC3239v0.f16053e;
            }
            i10 = Math.max(i10, i9);
        }
        this.f17311j = i10;
        this.f17312k = new int[this.f17303b.size() * 2];
        this.f17314m = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void m5601a(int i7) {
        this.f17313l += i7;
        int[] iArr = this.f17312k;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            boolean z7 = this.f17310i;
            if ((z7 && i8 % 2 == 1) || (!z7 && i8 % 2 == 0)) {
                iArr[i8] = iArr[i8] + i7;
            }
        }
    }

    /* renamed from: b */
    public final void m5602b(int i7, int i8, int i9) {
        int i10;
        int i11;
        this.f17313l = i7;
        boolean z7 = this.f17310i;
        if (z7) {
            i10 = i9;
        } else {
            i10 = i8;
        }
        this.f17314m = i10;
        List list = this.f17303b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) list.get(i12);
            int i13 = i12 * 2;
            int[] iArr = this.f17312k;
            if (z7) {
                InterfaceC3796d interfaceC3796d = this.f17306e;
                if (interfaceC3796d != null) {
                    iArr[i13] = interfaceC3796d.mo5824a(abstractC3239v0.f16053e, i8, this.f17308g);
                    iArr[i13 + 1] = i7;
                    i11 = abstractC3239v0.f16054f;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
            } else {
                iArr[i13] = i7;
                int i14 = i13 + 1;
                C3801i c3801i = this.f17307f;
                if (c3801i != null) {
                    iArr[i14] = c3801i.m5826a(abstractC3239v0.f16054f, i9);
                    i11 = abstractC3239v0.f16053e;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
            }
            i7 += i11;
        }
    }
}
