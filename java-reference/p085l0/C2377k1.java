package p085l0;

import java.util.ArrayList;
import p077k.AbstractC2204m0;
import p077k.C2184c0;
import p077k.C2194h0;
import p101n0.C2701a;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.k1 */
/* loaded from: classes.dex */
public final class C2377k1 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ C2381l1 f13425e;

    public C2377k1(C2381l1 c2381l1) {
        this.f13425e = c2381l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object valueOf;
        boolean z7;
        Object obj;
        ArrayList arrayList = this.f13425e.f13438a;
        C2194h0 c2194h0 = new C2194h0(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C2404r0 c2404r0 = (C2404r0) arrayList.get(i7);
            Object obj2 = c2404r0.f13536b;
            int i8 = c2404r0.f13535a;
            if (obj2 != null) {
                valueOf = new C2400q0(Integer.valueOf(i8), c2404r0.f13536b);
            } else {
                valueOf = Integer.valueOf(i8);
            }
            int m3591f = c2194h0.m3591f(valueOf);
            if (m3591f < 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                obj = null;
            } else {
                obj = c2194h0.f12678c[m3591f];
            }
            if (obj != null) {
                if (obj instanceof C2184c0) {
                    C2184c0 c2184c0 = (C2184c0) obj;
                    c2184c0.m3556a(c2404r0);
                    c2404r0 = c2184c0;
                } else {
                    Object[] objArr = AbstractC2204m0.f12712a;
                    C2184c0 c2184c02 = new C2184c0(2);
                    c2184c02.m3556a(obj);
                    c2184c02.m3556a(c2404r0);
                    c2404r0 = c2184c02;
                }
            }
            if (z7) {
                int i9 = ~m3591f;
                c2194h0.f12677b[i9] = valueOf;
                c2194h0.f12678c[i9] = c2404r0;
            } else {
                c2194h0.f12678c[m3591f] = c2404r0;
            }
        }
        return new C2701a(c2194h0);
    }
}
