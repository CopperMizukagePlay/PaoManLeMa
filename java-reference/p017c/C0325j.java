package p017c;

import java.util.ArrayList;
import p008b.C0222a0;
import p008b.C0238i0;
import p025d.C0454a;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.j */
/* loaded from: classes.dex */
public final class C0325j {

    /* renamed from: a */
    public final C0238i0 f1134a = new C0238i0(this);

    /* renamed from: b */
    public final C0454a f1135b;

    /* renamed from: c */
    public InterfaceC3277a f1136c;

    public C0325j(C0319d c0319d) {
        this.f1135b = new C0454a(this, c0319d);
    }

    /* renamed from: a */
    public final void m674a(boolean z7) {
        boolean z8;
        C0238i0 c0238i0 = this.f1134a;
        c0238i0.f927b = z7;
        ArrayList arrayList = c0238i0.f926a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0222a0 c0222a0 = (C0222a0) obj;
            if (c0222a0.f899e && z7) {
                z8 = true;
            } else {
                z8 = false;
            }
            c0222a0.m4971f(z8);
        }
        this.f1135b.m4971f(z7);
    }
}
