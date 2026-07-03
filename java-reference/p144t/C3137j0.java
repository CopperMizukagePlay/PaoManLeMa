package p144t;

import p092m.AbstractC2487d;
import p140s2.C3096f;
import p140s2.EnumC3103m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.j0 */
/* loaded from: classes.dex */
public final class C3137j0 implements InterfaceC3135i0 {

    /* renamed from: a */
    public final float f15795a;

    /* renamed from: b */
    public final float f15796b;

    /* renamed from: c */
    public final float f15797c;

    /* renamed from: d */
    public final float f15798d;

    public C3137j0(float f7, float f8, float f9, float f10) {
        this.f15795a = f7;
        this.f15796b = f8;
        this.f15797c = f9;
        this.f15798d = f10;
        if (f7 >= 0.0f) {
            if (f8 >= 0.0f) {
                if (f9 >= 0.0f) {
                    if (f10 >= 0.0f) {
                        return;
                    } else {
                        throw new IllegalArgumentException("Bottom padding must be non-negative");
                    }
                }
                throw new IllegalArgumentException("End padding must be non-negative");
            }
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        throw new IllegalArgumentException("Start padding must be non-negative");
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: a */
    public final float mo4824a() {
        return this.f15798d;
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: b */
    public final float mo4825b() {
        return this.f15796b;
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: c */
    public final float mo4826c(EnumC3103m enumC3103m) {
        if (enumC3103m == EnumC3103m.f15703e) {
            return this.f15797c;
        }
        return this.f15795a;
    }

    @Override // p144t.InterfaceC3135i0
    /* renamed from: d */
    public final float mo4827d(EnumC3103m enumC3103m) {
        if (enumC3103m == EnumC3103m.f15703e) {
            return this.f15795a;
        }
        return this.f15797c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3137j0) {
            C3137j0 c3137j0 = (C3137j0) obj;
            if (C3096f.m4776a(this.f15795a, c3137j0.f15795a) && C3096f.m4776a(this.f15796b, c3137j0.f15796b) && C3096f.m4776a(this.f15797c, c3137j0.f15797c) && C3096f.m4776a(this.f15798d, c3137j0.f15798d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15798d) + AbstractC2487d.m4038b(this.f15797c, AbstractC2487d.m4038b(this.f15796b, Float.hashCode(this.f15795a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C3096f.m4777b(this.f15795a)) + ", top=" + ((Object) C3096f.m4777b(this.f15796b)) + ", end=" + ((Object) C3096f.m4777b(this.f15797c)) + ", bottom=" + ((Object) C3096f.m4777b(this.f15798d)) + ')';
    }
}
