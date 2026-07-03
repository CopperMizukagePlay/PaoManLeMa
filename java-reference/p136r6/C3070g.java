package p136r6;

import java.util.ArrayList;
import p067i4.C2071d;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.InterfaceC2620u;
import p128q6.C3002e;
import p128q6.C3006i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r6.g */
/* loaded from: classes.dex */
public final class C3070g {

    /* renamed from: a */
    public final C3006i f15663a;

    /* renamed from: b */
    public final ArrayList f15664b;

    /* renamed from: c */
    public final int f15665c;

    /* renamed from: d */
    public final C3002e f15666d;

    /* renamed from: e */
    public final C2592a0 f15667e;

    /* renamed from: f */
    public final int f15668f;

    /* renamed from: g */
    public final int f15669g;

    /* renamed from: h */
    public final int f15670h;

    /* renamed from: i */
    public int f15671i;

    public C3070g(C3006i c3006i, ArrayList arrayList, int i7, C3002e c3002e, C2592a0 c2592a0, int i8, int i9, int i10) {
        AbstractC3367j.m5100e(c2592a0, "request");
        this.f15663a = c3006i;
        this.f15664b = arrayList;
        this.f15665c = i7;
        this.f15666d = c3002e;
        this.f15667e = c2592a0;
        this.f15668f = i8;
        this.f15669g = i9;
        this.f15670h = i10;
    }

    /* renamed from: a */
    public static C3070g m4745a(C3070g c3070g, int i7, C3002e c3002e, C2592a0 c2592a0, int i8) {
        if ((i8 & 1) != 0) {
            i7 = c3070g.f15665c;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            c3002e = c3070g.f15666d;
        }
        C3002e c3002e2 = c3002e;
        if ((i8 & 4) != 0) {
            c2592a0 = c3070g.f15667e;
        }
        C2592a0 c2592a02 = c2592a0;
        int i10 = c3070g.f15668f;
        int i11 = c3070g.f15669g;
        int i12 = c3070g.f15670h;
        AbstractC3367j.m5100e(c2592a02, "request");
        return new C3070g(c3070g.f15663a, c3070g.f15664b, i9, c3002e2, c2592a02, i10, i11, i12);
    }

    /* renamed from: b */
    public final C2598d0 m4746b(C2592a0 c2592a0) {
        AbstractC3367j.m5100e(c2592a0, "request");
        ArrayList arrayList = this.f15664b;
        int size = arrayList.size();
        int i7 = this.f15665c;
        if (i7 < size) {
            this.f15671i++;
            C3002e c3002e = this.f15666d;
            if (c3002e != null) {
                if (((C2071d) c3002e.f15486d).m3323b(c2592a0.f14018a)) {
                    if (this.f15671i != 1) {
                        throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
                }
            }
            int i8 = i7 + 1;
            C3070g m4745a = m4745a(this, i8, null, c2592a0, 58);
            InterfaceC2620u interfaceC2620u = (InterfaceC2620u) arrayList.get(i7);
            C2598d0 mo4178a = interfaceC2620u.mo4178a(m4745a);
            if (mo4178a != null) {
                if (c3002e != null && i8 < arrayList.size() && m4745a.f15671i != 1) {
                    throw new IllegalStateException(("network interceptor " + interfaceC2620u + " must call proceed() exactly once").toString());
                }
                if (mo4178a.f14062k != null) {
                    return mo4178a;
                }
                throw new IllegalStateException(("interceptor " + interfaceC2620u + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interfaceC2620u + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }
}
