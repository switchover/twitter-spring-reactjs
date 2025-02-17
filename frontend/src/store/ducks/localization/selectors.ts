import { RootState } from "../../store";
import { LocalizationState } from "./contracts/state";
import { LoadingStatus } from "../../../types/common";

export const selectLocalization = (state: RootState): LocalizationState => state.localization;
export const selectCountryCodes = (state: RootState) => selectLocalization(state).countryCodes;
export const selectGifImages = (state: RootState) => selectLocalization(state).gifImages;
export const selectLanguages = (state: RootState) => selectLocalization(state).languages;
export const selectWallpapers = (state: RootState) => selectLocalization(state).wallpapers;
export const selectLoadingState = (state: RootState): LoadingStatus => selectLocalization(state).loadingState;
export const selectIsLocalizationLoading = (state: RootState): boolean => selectLoadingState(state) === LoadingStatus.LOADING;
export const selectIsLocalizationLoaded = (state: RootState): boolean => selectLoadingState(state) === LoadingStatus.LOADED;
export const selectIsLocalizationError = (state: RootState): boolean => selectLoadingState(state) === LoadingStatus.ERROR;
