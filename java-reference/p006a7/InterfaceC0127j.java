package p006a7;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.j */
/* loaded from: classes.dex */
public interface InterfaceC0127j extends InterfaceC0142y, WritableByteChannel {
    /* renamed from: E */
    InterfaceC0127j mo242E(String str);

    /* renamed from: e */
    InterfaceC0127j mo253e(C0130m c0130m);

    @Override // p006a7.InterfaceC0142y, java.io.Flushable
    void flush();

    /* renamed from: g */
    InterfaceC0127j mo255g(long j6);

    /* renamed from: k */
    InterfaceC0127j mo258k();

    /* renamed from: r */
    C0126i mo265r();

    InterfaceC0127j write(byte[] bArr);

    InterfaceC0127j writeByte(int i7);

    InterfaceC0127j writeInt(int i7);

    InterfaceC0127j writeShort(int i7);
}
