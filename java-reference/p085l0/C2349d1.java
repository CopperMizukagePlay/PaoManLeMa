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
/* renamed from: l0.d1 */
/* loaded from: classes.dex */
public final class C2349d1 extends AbstractC3479z implements Parcelable, InterfaceC3467n, InterfaceC2425y0, InterfaceC2390n2 {
    public static final Parcelable.Creator<C2349d1> CREATOR = new C2341b1(1);

    /* renamed from: f */
    public C2358f2 f13358f;

    public C2349d1(int i7) {
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        C2358f2 c2358f2 = new C2358f2(i7, m5244k.mo5221g());
        if (!(m5244k instanceof C3450a)) {
            c2358f2.f16668b = new C2358f2(i7, 1);
        }
        this.f13358f = c2358f2;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f13358f;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f13358f = (C2358f2) abstractC3451a0;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: c */
    public final AbstractC3451a0 mo3727c(AbstractC3451a0 abstractC3451a0, AbstractC3451a0 abstractC3451a02, AbstractC3451a0 abstractC3451a03) {
        if (((C2358f2) abstractC3451a02).f13397c == ((C2358f2) abstractC3451a03).f13397c) {
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
    public final int m3741g() {
        return ((C2358f2) AbstractC3465l.m5253t(this.f13358f, this)).f13397c;
    }

    @Override // p085l0.InterfaceC2390n2
    public Object getValue() {
        return Integer.valueOf(m3741g());
    }

    /* renamed from: h */
    public final void m3742h(int i7) {
        AbstractC3459f m5244k;
        C2358f2 c2358f2 = (C2358f2) AbstractC3465l.m5242i(this.f13358f);
        if (c2358f2.f13397c != i7) {
            C2358f2 c2358f22 = this.f13358f;
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                ((C2358f2) AbstractC3465l.m5248o(c2358f22, this, m5244k, c2358f2)).f13397c = i7;
            }
            AbstractC3465l.m5247n(m5244k, this);
        }
    }

    @Override // p085l0.InterfaceC2425y0
    public void setValue(Object obj) {
        m3742h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C2358f2) AbstractC3465l.m5242i(this.f13358f)).f13397c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(m3741g());
    }
}
