package p189y6;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y6.a */
/* loaded from: classes.dex */
public final class C3853a extends AbstractC2064e {

    /* renamed from: a */
    public final InterfaceC3856d f18087a;

    public C3853a(InterfaceC3856d interfaceC3856d) {
        AbstractC3367j.m5100e(interfaceC3856d, "trustRootIndex");
        this.f18087a = interfaceC3856d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3853a) && AbstractC3367j.m5096a(((C3853a) obj).f18087a, this.f18087a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18087a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // p065i2.AbstractC2064e
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List mo3260o(String str, List list) {
        AbstractC3367j.m5100e(list, "chain");
        AbstractC3367j.m5100e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        AbstractC3367j.m5099d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z7 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate mo5118a = this.f18087a.mo5118a(x509Certificate);
            if (mo5118a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(mo5118a)) {
                    arrayList.add(mo5118a);
                }
                if (AbstractC3367j.m5096a(mo5118a.getIssuerDN(), mo5118a.getSubjectDN())) {
                    try {
                        mo5118a.verify(mo5118a.getPublicKey());
                    } catch (GeneralSecurityException unused) {
                        z7 = true;
                    }
                }
                z7 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                AbstractC3367j.m5099d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3367j.m5098c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC3367j.m5096a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                    while (it.hasNext()) {
                    }
                }
                if (!z7) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
            }
            return arrayList;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
