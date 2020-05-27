package net.kyori.adventure.audience;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.sound.SoundStop;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * An audience that forwards all methods to another audience.
 */
public interface ForwardingAudience extends Audience {
  /**
   * Gets the forwarded audience.
   *
   * @return the forwarded audience
   */
  @NonNull Audience audience();

  @Override
  default void message(final @NonNull Component message) {
    this.audience().message(message);
  }

  @Override
  default void showBossBar(final @NonNull BossBar bar) {
    this.audience().showBossBar(bar);
  }

  @Override
  default void hideBossBar(final @NonNull BossBar bar) {
    this.audience().hideBossBar(bar);
  }

  @Override
  default void showActionBar(final @NonNull Component message) {
    this.audience().showActionBar(message);
  }

  @Override
  default void playSound(final @NonNull Sound sound) {
    this.audience().playSound(sound);
  }

  @Override
  default void stopSound(final @NonNull SoundStop stop) {
    this.audience().stopSound(stop);
  }

  @Override
  default void showTitle(final @NonNull Title title) {
    this.audience().showTitle(title);
  }

  @Override
  default void clearTitle() {
    this.audience().clearTitle();
  }

  @Override
  default void resetTitle() {
    this.audience().resetTitle();
  }
}
