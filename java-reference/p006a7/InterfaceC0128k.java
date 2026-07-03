package p006a7;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.k */
/* loaded from: classes.dex */
public interface InterfaceC0128k extends InterfaceC0116a0, ReadableByteChannel {
    /* renamed from: D */
    void mo241D(long j6);

    /* renamed from: F */
    long mo243F();

    /* renamed from: G */
    String mo244G(Charset charset);

    /* renamed from: H */
    InputStream mo245H();

    /* renamed from: I */
    void mo246I(long j6, C0126i c0126i);

    /* renamed from: i */
    C0130m mo257i(long j6);

    /* renamed from: l */
    boolean mo259l(long j6);

    /* renamed from: p */
    String mo263p();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j6);

    /* renamed from: v */
    int mo269v(C0136s c0136s);

    /* renamed from: x */
    String mo271x(long j6);
}
