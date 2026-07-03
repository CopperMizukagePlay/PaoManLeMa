package p085l0;

import android.os.Parcel;
import android.os.Parcelable;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3451a0;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.AbstractC3479z;
import p161v0.C3450a;
import p161v0.InterfaceC3467n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.c1 */
/* loaded from: classes.dex */
public final class C2345c1 extends AbstractC3479z implements Parcelable, InterfaceC3467n, InterfaceC2425y0, InterfaceC2390n2 {
    public static final Parcelable.Creator<C2345c1> CREATOR = new C2341b1(0);

    /* renamed from: f */
    public C2354e2 f13349f;

    public C2345c1(float f7) {
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        C2354e2 c2354e2 = new C2354e2(f7, m5244k.mo5221g());
        if (!(m5244k instanceof C3450a)) {
            c2354e2.f16668b = new C2354e2(f7, 1);
        }
        this.f13349f = c2354e2;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f13349f;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f13349f = (C2354e2) abstractC3451a0;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: c */
    public final AbstractC3451a0 mo3727c(AbstractC3451a0 abstractC3451a0, AbstractC3451a0 abstractC3451a02, AbstractC3451a0 abstractC3451a03) {
        if (((C2354e2) abstractC3451a02).f13393c == ((C2354e2) abstractC3451a03).f13393c) {
            return abstractC3451a02;
        }
        return null;
    }

    @Override // p161v0.InterfaceC3467n
    /* renamed from: d */
    public final InterfaceC2370i2 mo3728d() {
        return C2413u0.f13575j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final float m3729g() {
        return ((C2354e2) AbstractC3465l.m5253t(this.f13349f, this)).f13393c;
    }

    @Override // p085l0.InterfaceC2390n2
    public Object getValue() {
        return Float.valueOf(m3729g());
    }

    /* renamed from: h */
    public final void m3730h(float f7) {
        AbstractC3459f m5244k;
        C2354e2 c2354e2 = (C2354e2) AbstractC3465l.m5242i(this.f13349f);
        if (c2354e2.f13393c == f7) {
            return;
        }
        C2354e2 c2354e22 = this.f13349f;
        synchronized (AbstractC3465l.f16721c) {
            m5244k = AbstractC3465l.m5244k();
            ((C2354e2) AbstractC3465l.m5248o(c2354e22, this, m5244k, c2354e2)).f13393c = f7;
        }
        AbstractC3465l.m5247n(m5244k, this);
    }

    @Override // p085l0.InterfaceC2425y0
    public void setValue(Object obj) {
        m3730h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C2354e2) AbstractC3465l.m5242i(this.f13349f)).f13393c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(m3729g());
    }
}
