package p052g4;

import android.media.MediaPlayer;
import android.util.Log;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g4.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1675c implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        Log.w("d", "Failed to beep " + i7 + ", " + i8);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
