package p099m6;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import p006a7.InterfaceC0128k;
import p024c6.AbstractC0434a;
import p106n6.AbstractC2721b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC2602f0 implements Closeable {
    /* renamed from: b */
    public final InputStream m4147b() {
        return mo4146f().mo245H();
    }

    /* renamed from: c */
    public abstract long mo4144c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC2721b.m4358d(mo4146f());
    }

    /* renamed from: d */
    public abstract C2621v mo4145d();

    /* renamed from: f */
    public abstract InterfaceC0128k mo4146f();

    /* renamed from: h */
    public final String m4148h() {
        Charset charset;
        InterfaceC0128k mo4146f = mo4146f();
        try {
            C2621v mo4145d = mo4145d();
            if (mo4145d == null || (charset = mo4145d.m4179a(AbstractC0434a.f1477a)) == null) {
                charset = AbstractC0434a.f1477a;
            }
            String mo244G = mo4146f.mo244G(AbstractC2721b.m4373s(mo4146f, charset));
            mo4146f.close();
            return mo244G;
        } finally {
        }
    }
}
