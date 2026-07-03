package p160v;

import java.util.LinkedHashMap;
import p001a0.C0065q;
import p063i0.C1879e0;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p153u0.InterfaceC3335b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.f0 */
/* loaded from: classes.dex */
public final class C3409f0 {

    /* renamed from: a */
    public final InterfaceC3335b f16540a;

    /* renamed from: b */
    public final C0065q f16541b;

    /* renamed from: c */
    public final LinkedHashMap f16542c = new LinkedHashMap();

    public C3409f0(InterfaceC3335b interfaceC3335b, C0065q c0065q) {
        this.f16540a = interfaceC3335b;
        this.f16541b = c0065q;
    }

    /* renamed from: a */
    public final InterfaceC3281e m5176a(int i7, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f16542c;
        C3407e0 c3407e0 = (C3407e0) linkedHashMap.get(obj);
        if (c3407e0 != null && c3407e0.f16536c == i7 && AbstractC3367j.m5096a(c3407e0.f16535b, obj2)) {
            C3173d c3173d = c3407e0.f16537d;
            if (c3173d == null) {
                C3173d c3173d2 = new C3173d(1403994769, new C1879e0(10, c3407e0.f16538e, c3407e0), true);
                c3407e0.f16537d = c3173d2;
                return c3173d2;
            }
            return c3173d;
        }
        C3407e0 c3407e02 = new C3407e0(this, i7, obj, obj2);
        linkedHashMap.put(obj, c3407e02);
        C3173d c3173d3 = c3407e02.f16537d;
        if (c3173d3 == null) {
            C3173d c3173d4 = new C3173d(1403994769, new C1879e0(10, this, c3407e02), true);
            c3407e02.f16537d = c3173d4;
            return c3173d4;
        }
        return c3173d3;
    }

    /* renamed from: b */
    public final Object m5177b(Object obj) {
        if (obj != null) {
            C3407e0 c3407e0 = (C3407e0) this.f16542c.get(obj);
            if (c3407e0 != null) {
                return c3407e0.f16535b;
            }
            InterfaceC3413h0 interfaceC3413h0 = (InterfaceC3413h0) this.f16541b.mo52a();
            int mo5056b = interfaceC3413h0.mo5056b(obj);
            if (mo5056b != -1) {
                return interfaceC3413h0.mo5058d(mo5056b);
            }
            return null;
        }
        return null;
    }
}
