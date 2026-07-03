package androidx.compose.p007ui.input.pointer;

import p117p1.C2857h0;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final Object f773a;

    /* renamed from: b */
    public final Object f774b;

    /* renamed from: c */
    public final PointerInputEventHandler f775c;

    public SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i7) {
        obj2 = (i7 & 2) != 0 ? null : obj2;
        this.f773a = obj;
        this.f774b = obj2;
        this.f775c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuspendPointerInputElement) {
                SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
                if (AbstractC3367j.m5096a(this.f773a, suspendPointerInputElement.f773a) && AbstractC3367j.m5096a(this.f774b, suspendPointerInputElement.f774b) && this.f775c == suspendPointerInputElement.f775c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C2857h0(this.f773a, this.f774b, this.f775c);
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        Object obj = this.f773a;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        Object obj2 = this.f774b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return this.f775c.hashCode() + ((i9 + i8) * 961);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2857h0 c2857h0 = (C2857h0) abstractC3809q;
        Object obj = c2857h0.f14981s;
        Object obj2 = this.f773a;
        boolean z7 = true;
        boolean z8 = !AbstractC3367j.m5096a(obj, obj2);
        c2857h0.f14981s = obj2;
        Object obj3 = c2857h0.f14982t;
        Object obj4 = this.f774b;
        if (!AbstractC3367j.m5096a(obj3, obj4)) {
            z8 = true;
        }
        c2857h0.f14982t = obj4;
        Class<?> cls = c2857h0.f14984v.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f775c;
        if (cls == pointerInputEventHandler.getClass()) {
            z7 = z8;
        }
        if (z7) {
            c2857h0.m4535M0();
        }
        c2857h0.f14984v = pointerInputEventHandler;
    }
}
