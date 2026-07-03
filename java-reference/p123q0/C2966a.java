package p123q0;

import java.util.NoSuchElementException;
import p077k.C2215s;
import p079k1.C2259a0;
import p166v5.InterfaceC3596c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.a */
/* loaded from: classes.dex */
public final class C2966a extends C2215s implements InterfaceC3596c {

    /* renamed from: h */
    public final C2259a0 f15369h;

    /* renamed from: i */
    public Object f15370i;

    public C2966a(C2259a0 c2259a0, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f15369h = c2259a0;
        this.f15370i = obj2;
    }

    @Override // p077k.C2215s, java.util.Map.Entry
    public final Object getValue() {
        return this.f15370i;
    }

    @Override // p077k.C2215s, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i7;
        Object obj2 = this.f15370i;
        this.f15370i = obj;
        C2970e c2970e = (C2970e) this.f15369h.f13099f;
        C2969d c2969d = c2970e.f15383h;
        Object obj3 = this.f12737f;
        if (!c2969d.containsKey(obj3)) {
            return obj2;
        }
        boolean z7 = c2970e.f15376g;
        if (z7) {
            if (z7) {
                AbstractC2977l abstractC2977l = c2970e.f15374e[c2970e.f15375f];
                Object obj4 = abstractC2977l.f15397e[abstractC2977l.f15399g];
                c2969d.put(obj3, obj);
                if (obj4 != null) {
                    i7 = obj4.hashCode();
                } else {
                    i7 = 0;
                }
                c2970e.m4613c(i7, c2969d.f15379g, obj4, 0);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            c2969d.put(obj3, obj);
        }
        c2970e.f15386k = c2969d.f15381i;
        return obj2;
    }
}
