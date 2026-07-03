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
/* renamed from: l0.g1 */
/* loaded from: classes.dex */
public final class C2361g1 extends AbstractC3479z implements Parcelable, InterfaceC3467n {
    public static final Parcelable.Creator<C2361g1> CREATOR = new Object();

    /* renamed from: f */
    public final InterfaceC2370i2 f13401f;

    /* renamed from: g */
    public C2366h2 f13402g;

    public C2361g1(Object obj, InterfaceC2370i2 interfaceC2370i2) {
        this.f13401f = interfaceC2370i2;
        AbstractC3459f m5244k = AbstractC3465l.m5244k();
        C2366h2 c2366h2 = new C2366h2(m5244k.mo5221g(), obj);
        if (!(m5244k instanceof C3450a)) {
            c2366h2.f16668b = new C2366h2(1, obj);
        }
        this.f13402g = c2366h2;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: a */
    public final AbstractC3451a0 mo3725a() {
        return this.f13402g;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: b */
    public final void mo3726b(AbstractC3451a0 abstractC3451a0) {
        AbstractC3367j.m5098c(abstractC3451a0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f13402g = (C2366h2) abstractC3451a0;
    }

    @Override // p161v0.InterfaceC3478y
    /* renamed from: c */
    public final AbstractC3451a0 mo3727c(AbstractC3451a0 abstractC3451a0, AbstractC3451a0 abstractC3451a02, AbstractC3451a0 abstractC3451a03) {
        if (this.f13401f.mo3798a(((C2366h2) abstractC3451a02).f13409c, ((C2366h2) abstractC3451a03).f13409c)) {
            return abstractC3451a02;
        }
        return null;
    }

    @Override // p161v0.InterfaceC3467n
    /* renamed from: d */
    public final InterfaceC2370i2 mo3728d() {
        return this.f13401f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p085l0.InterfaceC2390n2
    public final Object getValue() {
        return ((C2366h2) AbstractC3465l.m5253t(this.f13402g, this)).f13409c;
    }

    @Override // p085l0.InterfaceC2425y0
    public final void setValue(Object obj) {
        AbstractC3459f m5244k;
        C2366h2 c2366h2 = (C2366h2) AbstractC3465l.m5242i(this.f13402g);
        if (!this.f13401f.mo3798a(c2366h2.f13409c, obj)) {
            C2366h2 c2366h22 = this.f13402g;
            synchronized (AbstractC3465l.f16721c) {
                m5244k = AbstractC3465l.m5244k();
                ((C2366h2) AbstractC3465l.m5248o(c2366h22, this, m5244k, c2366h2)).f13409c = obj;
            }
            AbstractC3465l.m5247n(m5244k, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((C2366h2) AbstractC3465l.m5242i(this.f13402g)).f13409c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        parcel.writeValue(getValue());
        C2413u0 c2413u0 = C2413u0.f13572g;
        InterfaceC2370i2 interfaceC2370i2 = this.f13401f;
        if (AbstractC3367j.m5096a(interfaceC2370i2, c2413u0)) {
            i8 = 0;
        } else if (AbstractC3367j.m5096a(interfaceC2370i2, C2413u0.f13575j)) {
            i8 = 1;
        } else if (AbstractC3367j.m5096a(interfaceC2370i2, C2413u0.f13573h)) {
            i8 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i8);
    }
}
