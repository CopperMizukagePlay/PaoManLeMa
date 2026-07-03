package p161v0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3596c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.w */
/* loaded from: classes.dex */
public final class C3476w implements Map.Entry, InterfaceC3596c {

    /* renamed from: e */
    public final Object f16766e;

    /* renamed from: f */
    public Object f16767f;

    /* renamed from: g */
    public final /* synthetic */ C3477x f16768g;

    public C3476w(C3477x c3477x) {
        this.f16768g = c3477x;
        Map.Entry entry = c3477x.f16772h;
        AbstractC3367j.m5097b(entry);
        this.f16766e = entry.getKey();
        Map.Entry entry2 = c3477x.f16772h;
        AbstractC3367j.m5097b(entry2);
        this.f16767f = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16766e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16767f;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C3477x c3477x = this.f16768g;
        if (c3477x.f16769e.m5272e().f16736d == c3477x.f16771g) {
            Object obj2 = this.f16767f;
            c3477x.f16769e.put(this.f16766e, obj);
            this.f16767f = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
