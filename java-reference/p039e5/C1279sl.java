package p039e5;

import android.text.TextUtils;
import java.net.InetAddress;
import java.util.List;
import p001a0.AbstractC0094y0;
import p096m3.C2573w;
import p096m3.InterfaceC2566p;
import p099m6.InterfaceC2611l;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sl */
/* loaded from: classes.dex */
public final class C1279sl implements InterfaceC2611l, InterfaceC2566p {

    /* renamed from: e */
    public final /* synthetic */ int f7621e;

    /* renamed from: f */
    public final String f7622f;

    public /* synthetic */ C1279sl(String str, int i7) {
        this.f7621e = i7;
        this.f7622f = str;
    }

    @Override // p099m6.InterfaceC2611l
    /* renamed from: e */
    public List mo34e(String str) {
        AbstractC3367j.m5100e(str, "hostname");
        return AbstractC3784a.m5817z(InetAddress.getByName(this.f7622f));
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: k */
    public boolean mo147k(CharSequence charSequence, int i7, int i8, C2573w c2573w) {
        if (TextUtils.equals(charSequence.subSequence(i7, i8), this.f7622f)) {
            c2573w.f13973c = (c2573w.f13973c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f7621e) {
            case 1:
                return AbstractC0094y0.m187n(new StringBuilder("<"), this.f7622f, '>');
            default:
                return super.toString();
        }
    }

    @Override // p096m3.InterfaceC2566p
    /* renamed from: b */
    public Object mo141b() {
        return this;
    }
}
